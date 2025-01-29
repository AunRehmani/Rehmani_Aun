   class Wallet {
       double spaces[];
       double amount;
       double updateampount;
       int capacity = 50000;
       int top;

       public Wallet(double amount, double updateampount, int capacity, int top) {
           this.amount = amount;
           this.updateampount = updateampount;
           spaces = new double[capacity];
           this.capacity = capacity;
           this.top = -1;
       }

       class walletmanage {
           public boolean isEpmty() {
               if (amount == 0 && updateampount == 0) {
                   System.out.printf("Update your account balance");
                   return true;
               }
               return false;
           }

           public boolean isFull() {
               if (amount == 50000) {
                   System.out.printf("Account capacity is full");
                   return true;

               }
               return false;
           }

           void pushamount(double amount) {
               if (isFull()) {
                   System.out.println("Account capacity is full");
               } else {
                   spaces[top++] = updateampount;

               }
//

           }
       }


               public static void  main(String[] args) {
                   Wallet wallet = new Wallet(12000, 5, 50000, 5);
                   walletmanage manage = wallet.new walletmanage();
                   manage.pushamount(5);
               }

           }



