package ch14;

import java.awt.*;

public class AwtEx extends Frame {
    Button btn;
    Label lbl ;
    TextArea ta;
    TextField tf;
    Checkbox cb1, cb2;
    Choice choice;
    List list;

    AwtEx () {
        btn = new Button("button");
        lbl = new Label("label");
        ta = new TextArea("텍스트어리어", 5, 20);    // 5행, 20열
        tf = new TextField("텍스트필드", 20);    // 20칸
        cb1 = new Checkbox("checkbox");
        cb2 = new Checkbox("checkbox2");
        choice = new Choice();
        list = new List(3,true);    // 보여지는것은 2개이고 다중선택은 true로 지정
    }
    void display() {
        setLayout(new FlowLayout());    // 컴포넌트 배치 설정
        add(btn);
        add(lbl);
        add(ta);
        add(tf);
        add(cb1);
        add(cb2);

        choice.add("green"); // 콤보박스에 항목 추가
        choice.add("red");
        choice.add("blue");
        add(choice);

        list.add("onj");
        list.add("onjprogramming");
        list.add("onjsystems");
        add(list);

        pack();
        setVisible(true);
    }

    public static void main(String args[]) {
        AwtEx myFrame = new AwtEx();
        myFrame.display();
    }
}