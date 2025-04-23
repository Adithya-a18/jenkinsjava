

class car {
    void show() {
        System.out.println("This is me car .");
    }
}

class bike extends car {
    void display() {
        System.out.println("This is me bike");
    }
}

public class inherit {
    public static void main(String[] args) {
        bike b = new bike();

       b.display();
       b.show();
    }
}

