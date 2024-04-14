public class testStack {
    public static void main(String[] args) {
        MyArrayStack arrayStack = new MyArrayStack(3);
        MyLinkListStack stack = new MyLinkListStack();
//        arrayStack.push(1);
//        arrayStack.push(2);
//        arrayStack.push(3);
//        arrayStack.show();
//        arrayStack.pop();
//        arrayStack.show();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.show();
        stack.pop();
        stack.show();
    }
}
