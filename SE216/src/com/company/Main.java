package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Scanner scanner = new Scanner(System.in);

        Hotel hotel1 = new Hotel("SwissOtel", "Expensive", "Alsancak");
        Hotel hotel2 = new Hotel("RamadaEncoreByWyndham", "Expensive", "Balçova");
        Hotel hotel3 = new Hotel("FourPointsBySheraton", "Expensive", "Bayraklı");
        Hotel hotel4 = new Hotel("HiltonGardenInn", "Expensive", "Bayraklı");
        Hotel hotel5 = new Hotel("DoubleTreeByHilton", "Expensive", "Alsancak");
        Hotel hotel6 = new Hotel("RegesLuxuryCollectionResortSpa", "Expensive", "Çeşme");
        Hotel hotel7 = new Hotel("OlivieraResort", "Expensive", "Dikili");
        Hotel hotel8 = new Hotel("ManejUrla", "Expensive", "Urla");

        Hotel[] expensiveHotels = {hotel1, hotel2, hotel3, hotel4, hotel5, hotel6, hotel7, hotel8};

        Hotel hotel9 = new Hotel("Volley Hotel", "Cheap", "Alsancak");
        Hotel hotel10 = new Hotel("Marla Hotel", "Cheap", "Alsancak");
        Hotel hotel11 = new Hotel("SCInnBoutiqueHotel", "Cheap", "Konak");
        Hotel hotel12 = new Hotel("ExtensoHotel", "Cheap", "Gaziemir");
        Hotel hotel13 = new Hotel("RamadaHotelByWyndham", "Cheap", "Kemalpasa");
        Hotel hotel14 = new Hotel("HanedanBeachOtel", "Cheap", "Foca");

        Hotel[] cheapHotels = {hotel9, hotel10, hotel11, hotel12, hotel13, hotel14};


        Hotel hotel15 = new Hotel("BalcovaTermal", "Normal", "Normal");
        Hotel hotel16 = new Hotel("BestWesternPremier", "Normal", "Alsancak");
        Hotel hotel17 = new Hotel("AnemonCiğli", "Normal", "Alsancak");
        Hotel hotel18 = new Hotel("TavAirportHotel", "Normal", "Alsancak");
        Hotel hotel19 = new Hotel("SvalinnHotel", "Normal", "Alsancak");
        Hotel hotel20 = new Hotel("HotelKaraburun", "Normal", "Alsancak");

        Hotel[] normalHotels = {hotel15, hotel16, hotel17, hotel18, hotel19, hotel20};

        Transportation trasportation1 = new Transportation("Bus", 7.64);
        Transportation trasportation2 = new Transportation("Subway", 7.64);
        Transportation trasportation3 = new Transportation("Tram", 7.64);
        Transportation trasportation4 = new Transportation("Ferryboat", 7.64);
        Transportation trasportation5 = new Transportation("Taxi", 50);
        Transportation trasportation6 = new Transportation("Dolmuş", 6);


        Transportation[] transportations = {trasportation1, trasportation2, trasportation3, trasportation4, trasportation5, trasportation6};


        Restaurant restaurant1 = new Restaurant("Casa De Costa", "Expensive", "Sahilevleri");
        Restaurant restaurant2 = new Restaurant("Big Chefs", "Expensive", "Balçova");
        Restaurant restaurant3 = new Restaurant("Deniz Restaurant", "Expensive", "Alsancak");
        Restaurant restaurant4 = new Restaurant("Adabeyi Balık Restaurant", "Expensive", "Konak");
        Restaurant restaurant5 = new Restaurant("Olta Balık Restaurant", "Expensive", "Bostanlı");

        Restaurant[] expensiveRestaurants = {restaurant1, restaurant2, restaurant3, restaurant4, restaurant5};

        Restaurant restaurant6 = new Restaurant("Ohannes Burger", "Normal", "Bornova");
        Restaurant restaurant7 = new Restaurant("Konyali Ahmet Usta", "Normal", "Bayraklı");
        Restaurant restaurant8 = new Restaurant("En Gözde", "Normal", "Karşıyaka");
        Restaurant restaurant9 = new Restaurant("Mengoli Burgers Steak", "Normal", "Bostanlı");
        Restaurant restaurant10 = new Restaurant("Ciğerci Bahattin", "Normal", "Buca");
        Restaurant restaurant11 = new Restaurant("Pizza Locale", "Normal", "");

        Restaurant[] normalRestaurants = {restaurant6, restaurant7, restaurant8, restaurant9, restaurant10, restaurant11};


        Restaurant restaurant12 = new Restaurant("BurgerKing", "Cheap", "Çiğli");
        Restaurant restaurant13 = new Restaurant("Altınmaşa", "Cheap", "Bornova");
        Restaurant restaurant14 = new Restaurant("KFC", "Cheap", "Konak");
        Restaurant restaurant15 = new Restaurant("Katık Döner", "Cheap", "Balçova");


        Restaurant[] cheapRestaurants = {restaurant12, restaurant13, restaurant14, restaurant15};

        TouristicPlace touristicPlace1 = new TouristicPlace("KEY Museum", "Torbalı", "Expensive");
        TouristicPlace touristicPlace2 = new TouristicPlace("Efes Ancient City", "Selcuk", "Expensive");
        TouristicPlace touristicPlace3 = new TouristicPlace("İzmir Natural Life Park", "Çiğli", "Expensive");

        TouristicPlace[] expensiveTouristicPlaces = {touristicPlace1, touristicPlace2, touristicPlace3};


        TouristicPlace touristicPlace4 = new TouristicPlace("Atatürk Museum", "Alsancak", "Cheap");
        TouristicPlace touristicPlace5 = new TouristicPlace("Izmir Museum of Art and History", "Çankaya", "Cheap");
        TouristicPlace touristicPlace6 = new TouristicPlace("Archaeological Museum of Izmir", "Konak", "Cheap");
        TouristicPlace touristicPlace7 = new TouristicPlace("Natural History Museum", "Bornova", "Cheap");
        TouristicPlace touristicPlace8 = new TouristicPlace("Clock Tower", "Konak", "Cheap");
        TouristicPlace touristicPlace9 = new TouristicPlace("Agora Open Air Museum", "Konak", "Cheap");
        TouristicPlace touristicPlace10 = new TouristicPlace("Kadifekale", "Konak", "Cheap");
        TouristicPlace touristicPlace11 = new TouristicPlace("Grotto of the Seven Sleepers", "Selçuk", "Cheap");
        TouristicPlace touristicPlace12 = new TouristicPlace("The Virgin Mary's House", "Selçuk", "Cheap");

        TouristicPlace[] cheapTouristicPlaces = {touristicPlace4, touristicPlace5, touristicPlace6, touristicPlace7, touristicPlace8, touristicPlace9, touristicPlace10, touristicPlace11, touristicPlace12};


        TouristicPlace touristicPlace13 = new TouristicPlace("Kemeraltı", "Konak", "Normal");
        TouristicPlace touristicPlace14 = new TouristicPlace("Arkas Art Gallery", "Alsancak", "Normal");
        TouristicPlace touristicPlace15 = new TouristicPlace("Tarihi Asansör", "Konak", "Normal");
        TouristicPlace touristicPlace16 = new TouristicPlace("Şirince", "Selçuk", "Normal");

        TouristicPlace[] normalTouristicPlaces = {touristicPlace13, touristicPlace14, touristicPlace15, touristicPlace16};


        System.out.println("Please choose your travel type");
        System.out.println("Press 1 for student, 2 for family, 3 for business travel,4 for profile page,and 5 for exit");
        int travelType = scanner.nextInt();
        while (true) {
            switch (travelType) {
                case 1:
                    while (true) {
                        System.out.println("You will view our best recommendations for students");
                        System.out.println("Please press 1 to view the hotels, press 2 for transportation, press 3 for restaurants, press 4 for touristic places,and press 5 for exit.");
                        Scanner scanner1 = new Scanner(System.in);
                        int studentPageChoose = scanner1.nextInt();

                        if (studentPageChoose == 1) {
                            for (Hotel cheapHotel : cheapHotels) {
                                System.out.println(cheapHotel.getName()+ " " + cheapHotel.getPrice()+ " " + cheapHotel.getLocation());
                            }

                        } else if (studentPageChoose == 2) {
                            for (Transportation transportation : transportations) {
                                System.out.println(transportation.getName()+ " " + transportation.getPrice());
                            }
                        } else if (studentPageChoose == 3) {
                            for (Restaurant cheapRestaurant : cheapRestaurants) {
                                System.out.println(cheapRestaurant.getName()+ " " + cheapRestaurant.getPrice()+ " " + cheapRestaurant.getLocation());
                            }
                        } else if (studentPageChoose == 4) {
                            for (TouristicPlace cheapTouristicPlace : cheapTouristicPlaces) {
                                System.out.println(cheapTouristicPlace.getName()+ " " + cheapTouristicPlace.getLocation()+ " " + cheapTouristicPlace.getBudget());
                            }
                        }
                            else if(studentPageChoose == 5){

                                System.out.println("Successfully logged out.");
                                System.exit(0);

                            } else {
                            System.out.println("You made an incorrect keystroke.");
                        }

                        break;
                    }break;
                case 2:
                    while (true) {
                        System.out.println("You will view our best recommendations for families");
                        System.out.println("Please press 1 to view the hotels, press 2 for transportation, press 3 for restaurants,press 4 for touristic places,and press 5 for exit.");
                        Scanner scanner2 = new Scanner(System.in);
                        int familyPageChoose = scanner2.nextInt();
                        if (familyPageChoose == 1) {
                            for (Hotel normalHotel : normalHotels) {
                                System.out.println(normalHotel.getName()+ " "+normalHotel.getPrice()+ " "+normalHotel.getLocation());
                            }

                        } else if (familyPageChoose == 2) {

                            for (Transportation transportation : transportations) {
                                System.out.println(transportation.getName()+ " "+transportation.getPrice());
                            }

                        } else if (familyPageChoose == 3) {


                            for (Restaurant normalRestaurant : normalRestaurants) {
                                System.out.println(normalRestaurant.getName()+ " "+normalRestaurant.getPrice()+ " "+normalRestaurant.getLocation());
                            }
                        } else if (familyPageChoose == 4) {

                            for (TouristicPlace normalTouristicPlace : normalTouristicPlaces) {
                                System.out.println(normalTouristicPlace.getName()+ " " + normalTouristicPlace.getLocation() + " "+ normalTouristicPlace.getBudget());
                            }
                        }
                         else if( familyPageChoose== 5){

                                System.out.println("Successfully logged out.");
                                System.exit(0);

                            }
                            else {
                            System.out.println("You made an incorrect keystroke.");
                        }

                        break;
                    }break;
                case 3:
                    while (true) {
                        System.out.println("You will view our best recommendations for business travel");
                        System.out.println("Please press 1 to view the hotels, press 2 for transportation, press 3 for restaurants,press 4 for touristic places,and press 5 for exit.");
                        Scanner scanner3 = new Scanner(System.in);
                        int businessPageChoose = scanner3.nextInt();
                        if (businessPageChoose == 1) {
                            for (Hotel expensiveHotel : expensiveHotels) {
                                System.out.println(expensiveHotel.getName()+ " "+expensiveHotel.getPrice()+ " "+expensiveHotel.getLocation());
                            }

                        } else if (businessPageChoose == 2) {
                            for (Transportation transportation : transportations) {
                                System.out.println(transportation.getName()+ " "+transportation.getPrice());
                            }


                        } else if (businessPageChoose == 3) {
                            for (Restaurant expensiveRestaurant : expensiveRestaurants) {
                                System.out.println(expensiveRestaurant.getName()+ " "+expensiveRestaurant.getPrice()+ " "+expensiveRestaurant.getLocation());
                            }
                        } else if (businessPageChoose == 4) {
                            for (TouristicPlace expensiveTouristicPlace : expensiveTouristicPlaces) {
                                System.out.println(expensiveTouristicPlace.getName()+ " " + expensiveTouristicPlace.getLocation()+ " " + expensiveTouristicPlace.getBudget());
                            }
                        }else if(businessPageChoose == 5){

                            System.out.println("Successfully logged out.");
                            System.exit(0);

                        }
                         else {
                            System.out.println("You made an incorrect keystroke.");
                        }
                         break;
                    }
                    break;
                case 4:
                    while (true) {
                     System.out.println("Welcome to your profile page");
                     System.out.println("Press 1 to add a favorite,press 2 to add your places ,press 3 to add a place you must go,press 4 to add the place you have gone to ,and press 5 to exit");
                        Scanner scanner4 = new Scanner(System.in);
                        int profilePageChoose = scanner4.nextInt();
                        ProfileManager profileManager=new ProfileManager();
                        if(profilePageChoose==1){
                            profileManager.addFavorites();

                        }
                        else if(profilePageChoose==2){
                            profileManager.addmyPlaces();
                        }
                        else if(profilePageChoose==3){
                            profileManager.mustGo();
                        }
                        else if(profilePageChoose==4){
                            profileManager.haveGone();
                        }
                        else if(profilePageChoose==5){
                            System.out.println("Successfully logged out.");
                            System.exit(0);
                        }
                        else{

                            System.out.println("You made an incorrect keystroke.");
                        }

                        break;
                    }
                    break;

                case 5:
                    while (true) {
                        System.out.println("Successfully logged out.");
                        System.exit(0);
                        break;
                    }
                    break;
            }


        }
    }
    }

