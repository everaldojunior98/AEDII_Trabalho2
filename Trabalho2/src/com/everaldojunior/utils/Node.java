package com.everaldojunior.utils;

public class Node
{
    //Tipo do ingresso
    private int type;
    //Próximo nó
    private Node nextNode;

    public Node(int type, Node next)
    {
        this.type = type;
        this.nextNode = next;
    }

    //Atualiza o próximo nó
    public void SetNextNode(Node next)
    {
        this.nextNode = next;
    }

    //Pega o próximo nó
    public Node GetNextNode()
    {
        return this.nextNode;
    }

    //Retorna o tipo do ingresso
    public int GetType()
    {
        return type;
    }
}