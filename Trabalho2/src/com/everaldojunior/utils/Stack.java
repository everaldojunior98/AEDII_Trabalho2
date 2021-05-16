package com.everaldojunior.utils;

//Pilha baseada em nós
public class Stack
{
    //Primeiro nó da pilha
    private Node firstNode;
    //Tamanho da pilha
    private int size;

    public Stack()
    {
        this.firstNode = null;
        this.size = 0;
    }

    //Adiciona um novo item a pilha
    public void Push(int id)
    {
        //Cria um novo nó e adiciona no topo da lista
        var node = new Node(id, firstNode);
        this.firstNode = node;
        this.size++;
    }

    //Remove o item do topo
    public int Pop()
    {
        //Checa se a pilha está vazia
        if(IsEmpty())
        {
            System.out.println("PILHA VAZIA");
            return -1;
        }

        var id = this.firstNode.GetType();
        this.firstNode = this.firstNode.GetNextNode();
        this.size--;

        return id;
    }

    //Checa se a pilha está vazia
    public boolean IsEmpty()
    {
        return this.size == 0;
    }
}