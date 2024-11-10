package lesson4;

public class Park {
        private String parkName;

        public Park(String parkName) {
            this.parkName = parkName;
        }

        public class Attraction {
            String name;
            String openingHours;
            int price;

            public Attraction(String name, String openingHours, int price) {
                this.name = name;
                this.openingHours = openingHours;
                this.price = price;
            }

            public void getAttractionInfo() {
                System.out.println("Аттракцион: " + name + ", Часы работы: " + openingHours + ", Цена: рублей" + price);
            }
        }


}
