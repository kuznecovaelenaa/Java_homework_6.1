package ru.netology.stats;

public class StatsService {

    //1
    public long sum(int[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    //2
    public long aver(int[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        long aver = sum / sales.length;
        return aver;
    }

    //3
    public long max(int[] sales) {
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
    public long min(int[] sales) {
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
    public long below(int[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        long aver = sum / sales.length;
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < aver) {
                count++;
            }
        }
        return count;
    }

    //6
    public long above(int[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        long aver = sum / sales.length;
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > aver) {
                count++;
            }
        }
        return count;
    }
}
