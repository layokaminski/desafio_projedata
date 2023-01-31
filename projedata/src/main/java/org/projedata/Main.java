package org.projedata;

import org.projedata.utils.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 3.1 – Inserir todos os funcionários, na mesma ordem e informações da tabela acima.
        var list = new GenerateListEmployees().generateList();

        // 3.2 – Remover o funcionário “João” da lista.
        new RemoveEmployee().remove(list, "João");

        // 3.3 – Imprimir todos os funcionários com todas suas informações, sendo que:
        //    • informação de data deve ser exibido no formato dd/mm/aaaa;
        //    • informação de valor numérico deve ser exibida no formatado com separador de milhar como ponto e decimal como vírgula.
        new PrintList().print(list);
        System.out.println("");

        // 3.4 – Os funcionários receberam 10% de aumento de salário, atualizar a lista de funcionários com novo valor.
        new IncreaseSalary().increase(list);
        System.out.println("");

        // 3.5 – Agrupar os funcionários por função em um MAP, sendo a chave a “função” e o valor a “lista de funcionários”.
        // 3.6 – Imprimir os funcionários, agrupados por função.
        new GroupOccupation().printList(list);
        System.out.println("");

        // 3.8 – Imprimir os funcionários que fazem aniversário no mês 10 e 12.
        new PrintForBirthdayMonth().print(list);
        System.out.println("");

        // 3.9 – Imprimir o funcionário com a maior idade, exibir os atributos: nome e idade.
        new GetOldestEmployee().print(list);
        System.out.println("");

        // 3.10 – Imprimir a lista de funcionários por ordem alfabética.
        new AlphabeticalOrder().print(list);
        System.out.println("");

        // 3.11 – Imprimir o total dos salários dos funcionários.
        var total = new TotalSalary().totalSalary(list);
        System.out.println(total);
        System.out.println("");

        // 3.12 – Imprimir quantos salários mínimos ganha cada funcionário, considerando que o salário mínimo é R$1212.00.
        new QuantityMinimumSalary().quantity(list);



    }
};