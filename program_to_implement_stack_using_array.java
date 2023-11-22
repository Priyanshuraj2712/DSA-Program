class stack_demo {
   char[] arr;
   int top = -1;

   stack_demo(int var1) {
      this.arr = new char[var1];
   }

   int size() {
      return this.top + 1;
   }

   Boolean isEmpty() {
      return this.top < 0;
   }

   Boolean isFull() {
      return this.arr.length == this.size();
   }

   void push(char var1) {
      if (this.isFull()) {
         System.out.println("Stack is full");
      } else {
         ++this.top;
         this.arr[this.top] = var1;
      }

   }

   void pop() {
      if (this.isEmpty()) {
         System.out.println("Stack is empty");
      } else {
         --this.top;
      }

   }

   char peek() {
      return this.arr[this.top];
   }
}
