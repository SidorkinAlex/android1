package com.example.android1;

import java.util.LinkedList;
import java.util.Scanner;

public class StringToResult {


    public boolean isOperation(char c)
    {
        return c == '+' || c == '-' || c == '÷' || c == '%' || c == 'x';
    }

    public boolean interval(char c)
    {
        return c == ' '; //mezery nebudeme uvažovat
    }
    public int opearatorsPriority(char operand)
    {
        switch (operand) {
            case '+':
            case '-':
                return 1;
            case 'x':
            case '÷':
            case '%':
                return 2;
            default:
                return -1;
        }
    }
    public void operator(LinkedList<Integer> cislo, char znak)
    {
        int r = cislo.removeLast();
        int l = cislo.removeLast();
        switch (znak) {
            case '+':
                cislo.add(l + r);
                break;
            case '-':
                cislo.add(l - r);
                break;
            case 'x':
                cislo.add(l * r);
                break;
            case '÷':
                cislo.add(l / r);
                break;
            case '%':
                cislo.add(l % r);
                break;
        }
    }


    public float make(String s)
    {
        StringToResult obj = new StringToResult();
        LinkedList<Integer> h = new LinkedList<Integer>();
        LinkedList<Character> op = new LinkedList<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (obj.interval(c))
                continue;

            if (c == '(')
            {
                op.add('('); //vlož na vrchol seznamu otevírací závorku, je-li zadána uživatelem
            }
            else if (c == ')')
            {
                while (op.getLast() != '(') //kontrola správnosti zápisu závorek
                    operator(h, op.removeLast());
                op.removeLast();
            }
            else if (obj.isOperation(c)) //zadal jste nějaký znak = ANO
            {
                while (!op.isEmpty() && obj.opearatorsPriority(op.getLast()) >= obj.opearatorsPriority(c))
                    //kontrola spravnosti seznamu op na znak
                    operator(h, op.removeLast());
                op.add(c);
            } else
            {
                String operand = "";
                while (i < s.length() && Character.isDigit(s.charAt(i)))
                    //zda je i nějaké číslo
                    operand += s.charAt(i++); //přejdi na další index
                --i;
                h.add(Integer.parseInt(operand));
            }
        }

        while (!op.isEmpty())
            operator(h, op.removeLast());
        return h.get(0);

    }
}