package com.stream;

import java.time.LocalDateTime;

public class SensorData  implements Comparable<SensorData>{
    private String sensorId;
    private LocalDateTime timestamp;
    private double temperature;
    private double humidity;
    private double pressure;

    public SensorData(String sensorId, LocalDateTime timestamp, double temperature, double humidity, double pressure) {
        this.sensorId = sensorId;
        this.timestamp = timestamp;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    // Getters and toString method

    public String getSensorId() {
        return sensorId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    @Override
    public String toString() {
        return "SensorData{" +
                "sensorId='" + sensorId + '\'' +
                ", timestamp=" + timestamp +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }

	

	@Override
	public int compareTo(SensorData o) {
		 return Double.compare(this.temperature, o.temperature);
		
	}
}

