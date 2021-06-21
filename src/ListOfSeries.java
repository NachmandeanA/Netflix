public class ListOfSeries {

    Series[] ListOfSeries;

    public ListOfSeries() {
        this.ListOfSeries = new Series[1];

    }

    public void addToList (Series s) {
        if (this.ListOfSeries[0] == null) {
            this.ListOfSeries[0] = s;
        }
        else {
            Series[] tempListSeries = new Series[this.ListOfSeries.length + 1];
            for (int i = 0; i < ListOfSeries.length; i++) {
                tempListSeries[i] = this.ListOfSeries[i];
            }
            tempListSeries[tempListSeries.length-1] = s;
            this.ListOfSeries = tempListSeries;

        }
    }
    public void removeFromList(Series s) {
        this.ListOfSeries[getSerieIndex(s)] = null;
        Series[] tempListSeries = new Series[this.ListOfSeries.length - 1];
        int j = 0;
        for (int i = 0; i < ListOfSeries.length; i++) {
            if (ListOfSeries[i].equals(null)) {

            }
            else {
                tempListSeries[j] = ListOfSeries[i];
                j++;
            }
        }
    }

    private int getSerieIndex(Series s) {
        return 0;
    }

    public boolean isExsist(Series o) {
        for (Series Serial : ListOfSeries) {
            if (Serial.equals(o)) {
                return true;
            }
        }
        return false;

    }

    public int getSerialIndex(Series o) {
        int counter = 0;
        while (!this.ListOfSeries[counter].equals(o)) {
            counter++;
        }
        return counter;
    }

    public Series getSerieByIndex(int index) {
        return this.ListOfSeries[index];
    }

    public Series[] getListOfSeries() {
        return ListOfSeries;
    }

    public void setListOfSeries(Series[] listOfSerials) {
        this.ListOfSeries = ListOfSeries;
    }

}
