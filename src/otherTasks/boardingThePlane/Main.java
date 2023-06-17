package otherTasks.boardingThePlane;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    private static final List<String> SEATS_STATUS = new ArrayList<>(); // Статус каждого места
    private static final List<String> PASSENGERS_GROUPS = new ArrayList<>(); // Пожелания пассажиров

    public static void main(String[] args) {
        getData();
        go();
    }

    private static void go() {
        for (String passengersGroup : PASSENGERS_GROUPS) {
            StringTokenizer st = new StringTokenizer(passengersGroup, " ");
            int num = Integer.parseInt(st.nextToken());
            String side = st.nextToken();
            String position = st.nextToken();

            for (int i = 0; i < SEATS_STATUS.size(); i++) {
                String row = SEATS_STATUS.get(i);
                int correct = 0;
                StringBuilder rowSb = new StringBuilder(row);
                int start = 0;
                if (side.equals("right")) {
                    if (position.equals("aisle")) {
                        start = row.indexOf("_") + 1;
                    } else {
                        start = row.length() - num;
                    }
                } else if (side.equals("left") && position.equals("aisle")) {
                    start = row.indexOf("_") - num;
                }
                for (int j = start; j < row.length(); j++) {
                    if (row.charAt(j) == '.') {
                        rowSb.setCharAt(j, 'X');
                        correct++;
                        if (correct == num) {
                            SEATS_STATUS.set(i, rowSb.toString());
                            System.out.println("Passengers can take seats:" + getSeat(i, rowSb));
                            for (String seatsStatus : SEATS_STATUS) {
                                System.out.println(seatsStatus);
                            }
                            String newRow = rowSb.toString().replace('X', '#');
                            SEATS_STATUS.set(i, newRow);
                            i = SEATS_STATUS.size();
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (i == SEATS_STATUS.size() - 1) {
                    System.out.println("Cannot fulfill passengers requirements");
                }
            }
        }
    }

    private static void getData() {
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte(); // Количество рядов в самолете
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String seatStatus = sc.nextLine();
            SEATS_STATUS.add(seatStatus);
        }
        byte m = sc.nextByte(); // Количество групп пассажиров
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            String passengerGroup = sc.nextLine();
            PASSENGERS_GROUPS.add(passengerGroup);
        }
    }

    private static String getSeat(int numRow, StringBuilder rowSb) {
        StringBuilder seats = new StringBuilder();
        for (int i = 0; i < rowSb.length(); i++) {
            if (rowSb.charAt(i) == 'X') {
                seats.append(" ").append((numRow + 1));
                switch (i) {
                    case 0 -> seats.append('A');
                    case 1 -> seats.append('B');
                    case 2 -> seats.append('C');
                    case 4 -> seats.append('D');
                    case 5 -> seats.append('E');
                    case 6 -> seats.append('F');
                }
            }
        }
        return seats.toString();
    }
}
