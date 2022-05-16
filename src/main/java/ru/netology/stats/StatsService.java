package ru.netology.stats;

public class StatsService {

    //1
    public long sum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    //2
    public long aver(long[] sales) {
        long sum = sum(sales);
        long aver = sum / sales.length;
        return aver;
    }

    //3
    public long max(long[] sales) {
        int maxMouth = 0;
        int mouth = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMouth]) {
                maxMouth = mouth;
            }
            mouth += 1;
        }
        return maxMouth + 1;
    }

    //4
    public long min(long[] sales) {
        int minMouth = 0;
        int mouth = 0;
        for (long sale : sales) {
            if (sale <= sales[minMouth]) {
                minMouth = mouth;
            }
            mouth += 1;
        }
        return minMouth + 1;
    }

    //5
    public long below(long[] sales) {
        long aver = aver(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < aver) {
                count++;
            }
        }
        return count;
    }

    //6
    public long above(long[] sales) {
        long aver = aver(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > aver) {
                count++;
            }
        }
        return count;
    }
}
