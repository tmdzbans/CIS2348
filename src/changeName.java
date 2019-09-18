public class changeName {
    public static void main(String[] args) {

        String name = "shakespere";
        System.out.println("in main, the name is " + name);

        changeName(name);

        System.out.println("back in a min, the name is " + name);
    }
        public static void changeName(String str)
        {

            str = "Dickins";

            System.out.println("In change name, the name " + "is now " + str );
        }




    }

