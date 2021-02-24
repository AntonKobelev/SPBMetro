package core;

public class Station implements Comparable<Station> // creating class station and implements interface comparable Station
{
    private Line line; // creating variable line type Line
    private String name; // creating variable name type String

    public Station(String name, Line line) // creating constructor with arguments name, line
    {
        this.name = name;
        this.line = line;
    }

    public Line getLine()
    {
        return line;
    } // creating method getLine  - return line

    public String getName()
    {
        return name;
    } // creating method getName - return name

    @Override
    public int compareTo(Station station) // override method compareTo with argument station type Station
    {
        int lineComparison = line.compareTo(station.getLine()); // creating variable lineComparison
        if(lineComparison != 0) { // if lineComparison not equals zero return lineComparison
            return lineComparison; // return lineComparison
        }
        return name.compareToIgnoreCase(station.getName()); // compare to ignore case and compare name station
    }

    @Override
    public boolean equals(Object obj)
    {
        return compareTo((Station) obj) == 0;
    } // creating method equals with argument Object return true if objects equals, else false.

    @Override
    public String toString()
    {
        return name;
    } // creating method toString, return name
}