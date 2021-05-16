package com.everaldojunior.utils;

//Fila utilizando array
public class Queue
{
    //Array generico para armazenar os itens
    private int items[];

    //Posição atual do cursor
    private int currentPosition;

    public Queue(int size)
    {
        //Instancia o array
        this.items = new int[size];
        this.currentPosition = 0;
    }

    //Enfileira um novo id
    public void Enqueue(int id)
    {
        //Checa se a fila está cheia
        if(this.currentPosition == this.items.length)
        {
            System.out.println("FILA CHEIA");
            return;
        }

        this.items[this.currentPosition] = id;
        this.currentPosition++;
    }

    //Desenfileira um elemento da fila
    public int Dequeue()
    {
        //Checa se a fila está vazia
        if(IsEmpty())
        {
            System.out.println("FILA VAZIA");
            return -1;
        }

        //Salva o primeiro elemento da fila para retornar
        var id = this.items[0];

        //Atualiza as posições do array
        this.items[0] = 0;
        for (var i = 1; i < this.currentPosition; i++)
        {
            this.items[i - 1] = this.items[i];
            this.items[i] = 0;
        }
        this.currentPosition--;

        return id;
    }

    //Verifica se a fila está vazia
    public boolean IsEmpty()
    {
        return this.currentPosition == 0;
    }
}