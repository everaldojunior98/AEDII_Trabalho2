package com.everaldojunior.utils;

//Um nó genérico
public class Node<T>
{
    //Tipo do ingresso
    private T data;
    //Próximo nó
    private Node<T> nextNode;

    public Node(T data, Node next)
    {
        this.data = data;
        this.nextNode = next;
    }

    //Atualiza o próximo nó
    public void SetNextNode(Node next)
    {
        this.nextNode = next;
    }

    //Pega o próximo nó
    public Node<T> GetNextNode()
    {
        return this.nextNode;
    }

    //Retorna o tipo do ingresso
    public T GetType()
    {
        return data;
    }
}