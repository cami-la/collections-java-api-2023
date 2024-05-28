package develop.java.list.ordenacao.OrdenacaoDePessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionaPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasListPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasListPorIdade);
        return pessoasListPorIdade;
    }

    public List<Pessoa> ordernarPorAltura(){
        List<Pessoa> pessoaListPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaListPorAltura, new ComparatorPorAltura());
        return pessoaListPorAltura;
    }

    public List<Pessoa> ordenarPorNome(){
        List<Pessoa> pessoaListPorNome = new ArrayList<>(pessoaList);
        Collections.sort(pessoaListPorNome, new ComparatorPorNome());
        return pessoaListPorNome;
    }


    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionaPessoa("Nome 2",30,1.80);
        ordenacaoPessoa.adicionaPessoa("Nome 1",20,1.56);
        ordenacaoPessoa.adicionaPessoa("Nome 4",17,1.56);
        ordenacaoPessoa.adicionaPessoa("Nome 3",25,1.70);

        System.out.println("Ordenação por idade: " + ordenacaoPessoa.ordenarPorIdade());
        System.out.println("Ordenação por altura: " + ordenacaoPessoa.ordernarPorAltura());
        System.out.println("Ordenação por nome:" + ordenacaoPessoa.ordenarPorNome());

    }

}
