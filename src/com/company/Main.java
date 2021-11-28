
	package com.company;

        public class Main<DeliveryDistance> {

            public static void main(String[] args) {
//              Задача 1 урок по условным операторам
                int clientOs = 0;
                if (clientOs > 0) ;
                System.out.println("Устнаовите версию приложения для Ios по ссылке ");

                int clientAndroid = 1;
                if (clientAndroid > 1) ;
                System.out.println("Установите версию приложения для Android по ссылке");

//              Задача 2
                int clientOnDeviceYearIos = 2015;

                if (clientOs > 0 && clientOnDeviceYearIos >= 2015) {
                    System.out.println("Установите облегченную версию для Ios по ссылке ");

                } else {
                    System.out.println("Установите обычную версию для Ios");
                }

                int clientOnDeviceYearAndroid = 2015;

                if (clientAndroid > 1 && clientOnDeviceYearAndroid <= 2015) {
                    System.out.println("Установите облегченную версию для Android");

                } else {
                    System.out.println("Установите обычную версию для Android");

//              Задача 3
                    int year = 2021;
                    boolean isNotLeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
                    System.out.println("не високосный год " + year);

//              Задача 4
                    int deliveryDistance = 95;
                    if (deliveryDistance <= 20 || deliveryDistance >= 95) {
                        System.out.println("доставка занимает сутки");

                        if (deliveryDistance <= 20 || deliveryDistance >= 60) {
                            System.out.println("Доставка занимает двое суток");
                            if (deliveryDistance <= 60 || deliveryDistance >= 100) {
                            }
                            System.out.println("доставка занимает трое суток");
                        }
//              Задача 5
                        int month = 12;
                        String season;
                        switch (month) {
                            case 12:
                            case 1:
                            case 2:
                                season = "зима";
                                break;
                            case 3:
                            case 4:
                            case 5:
                                season = "весна";
                                break;
                            case 6:
                            case 7:
                            case 8:
                                season = "лето";
                                break;
                            case 9:
                            case 10:
                            case 11:
                                season = "осень";
                                break;
                            default:
                                season = "ошибка" + (month > 0);


                        }
                        System.out.println(season);
                    }
                }
            }
        }

