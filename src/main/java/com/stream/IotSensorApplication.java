package com.stream;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class IotSensorApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(IotSensorApplication.class, args);
		
//		autobotsAssamble();
		
	}

	private static void autobotsAssamble() {
		
		List<SensorData> sensorDataList = Arrays.asList(
	                new SensorData("SENSOR001", LocalDateTime.of(2024, 8, 15, 10, 0), 22.5, 65.2, 1013.1),
	                new SensorData("SENSOR002", LocalDateTime.of(2024, 8, 15, 10, 5), 23.0, 63.5, 1012.8),
	                new SensorData("SENSOR001", LocalDateTime.of(2024, 8, 15, 10, 10), 22.8, 64.0, 1013.0),
	                new SensorData("SENSOR003", LocalDateTime.of(2024, 8, 15, 10, 15), 24.1, 60.8, 1012.5),
	                new SensorData("SENSOR002", LocalDateTime.of(2024, 8, 15, 10, 20), 23.2, 62.5, 1012.7),
	                new SensorData("SENSOR001", LocalDateTime.of(2024, 8, 15, 10, 25), 23.0, 63.8, 1013.2),
	                new SensorData("SENSOR003", LocalDateTime.of(2024, 8, 15, 10, 30), 24.3, 60.5, 1012.4),
	                new SensorData("SENSOR002", LocalDateTime.of(2024, 8, 15, 10, 35), 23.4, 61.5, 1012.6)
	        );
		
		
		
		 double threshold = 50.0;
		 
		List<SensorData> filteredData = sensorDataList.stream()
                .filter(data -> data.getTemperature() >= threshold &&
                                data.getHumidity() >= threshold &&
                                data.getPressure() >= threshold)
                .collect(Collectors.toList());

        System.out.println("Filtered Sensor Data:");
        filteredData.forEach(System.out::println);
        
        
        Collections.sort(sensorDataList);
        filteredData.forEach(System.out::println);
        
        
        
        
        
        
        
        
        
    }
		
		
		
		
	

}
