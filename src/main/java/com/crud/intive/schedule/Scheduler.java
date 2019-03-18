package com.crud.intive.schedule;

import com.crud.intive.domain.Position;
import com.crud.intive.repository.PositionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.stream.Collectors;


@Component
public class Scheduler {

    @Autowired
    private PositionDao positionDao;


    @Autowired
    private RestTemplate restTemplate;
    @Scheduled
    public void getDataSnapshot() throws URISyntaxException {

        URI uri = new URI("http://open-notify.org/Open-Notify-API/ISS-Location-Now/");
        PositionDao positionDao = restTemplate.getForObject(uri, PositionDao.class);
        Position position = (Position) positionDao.getLastPositions().stream()
                .map(t-> new Position(t.getLatitude(),t.getLongitude(),t.getTimestamp()))
                .collect(Collectors.toList());

                positionDao.save(position);
    }
}
