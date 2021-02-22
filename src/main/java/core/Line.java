package core;

import java.util.ArrayList;
import java.util.List;

public class Line implements Comparable<Line> // creating class Line and implements Comparable
{
    private int number; // creating variable number
    private String name; // creating variable name
    private List<Station> stations; // creating variable list stations

    public Line(int number, String name) // creating constructor Line and pass the arguments variable number and name
    {
        this.number = number; // assign variable number - argument number
        this.name = name; // assign variable name - argument name
        stations = new ArrayList<>(); // initialize arrayList
    }

    public int getNumber()
    {
        return number;
    } // creating method getNumber - get number line

    public String getName()
    {
        return name;
    } // creating method getName - get name line

    public void addStation(Station station)
    {
        stations.add(station);
    } // creating method addStations and pass argument type Stations

    public List<Station> getStations()
    {
        return stations;
    } // creating method getStations which returns stations

    @Override
    public int compareTo(Line line)
    {
        return Integer.compare(number, line.getNumber());
    } // redefine method compareTo

    @Override
    public boolean equals(Object obj)
    {
        return compareTo((Line) obj) == 0;
    }
}