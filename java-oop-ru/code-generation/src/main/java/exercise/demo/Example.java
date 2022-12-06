package exercise.demo;

import exercise.demo.Item;

class Example {
    public static void main(String[] args) {
        //data + getter/setter/toString
//        Item milk = new Item();
//        milk.setId(1);
//        milk.setName("Milk");
//        milk.setPrice(99.90);
//        System.out.println(milk);
//////
//        Item bread = new Item();
//        bread.setId(1);
//        bread.setName("RT");
//        bread.setPrice(99.40);
//        Item item=new Item(2,"cr", 4.0);
//        System.out.println(item);
//       System.out.println(milk.equals(bread));


        // builder
        Item item = Item.builder()
                .id(1)
                .name("Котлета")
                .price(100.0)
                .build();

//
        System.out.println(item);

        // nonNull
        Item item1 = Item.builder()
                .price(10.0)
                .name("Йогурт")
                .id(12)
                .build();
        System.out.println(item1);
    }
}
