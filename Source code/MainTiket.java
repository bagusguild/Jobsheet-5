public class MainTiket {
    public static void main(String[] args) {
        TicketService data = new TicketService();
        Ticket t1 = new Ticket("Rajawali", 200000, "Jakarta", "Semarang");
        Ticket t2 = new Ticket("Bird", 150000, "Jakarta", "Semarang");
        Ticket t3 = new Ticket("Tiger", 170000, "Jakarta", "Semarang");
        Ticket t4 = new Ticket("Flying", 185000, "Jakarta", "Semarang");
        Ticket t5 = new Ticket("Lion", 210000, "Jakarta", "Semarang");

        data.tambah(t1);
        data.tambah(t2);
        data.tambah(t3);
        data.tambah(t4);
        data.tambah(t5);

        System.out.println("Daftar Harga ticket sebelum di sorting = ");
        data.tampil();
        System.out.println();

        System.out.println("Data ticket setelah di sorting berdasarkan ipk");
        System.out.println("Sorting dengan metode Bubble sort");
        data.bubbleSort();
        data.tampil();
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("Sorting dengan metode Selection sort");
        data.selectionSort();
        data.tampil();
        System.out.println("-------------------------------");
    }
}