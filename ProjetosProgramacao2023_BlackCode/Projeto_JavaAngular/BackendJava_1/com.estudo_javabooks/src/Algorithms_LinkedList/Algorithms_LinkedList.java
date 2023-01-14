package Algorithms_LinkedList;

public class Algorithms_LinkedList {
        /**
         * Na ciência da computação, uma lista encadeada é uma coleção linear de elementos de dados, em que a ordem linear não é dada
         * por sua locação física na memória. Em vez disso, cada elemento aponta para o próximo. É uma estrutura de dados consistindo em 
         * um grupo de nós que juntos representam uma sequência. Sob a forma mais simples, cada nó é composto de dados e uma referência 
         * (em outras palavras, uma ligação/conexão) para o próximo nó na sequência. Esta estrutura permite inserção ou remoção eficiente de 
         * elementos de qualquer posição na sequência durante a iteração. 
         * Variantes mais complexas adicionam ligações adicionais, permitindo uma inserção ou remoção mais eficiente a partir de referências 
         * de elementos arbitrárias. Uma desvantagem das listas encadeadas é que o tempo de acesso é linear (e difícil de inserir em uma pipeline). 
         * Acesso mais rápido, como acesso aleatório, não é viável. Arrays possuem uma melhor localização de cache em comparação com listas 
         * encadeadas (linked lists).
         * 
         * Inserção
         * 
        Add(head, value)
        Pre: value is the value to add to the list
        Post: value has been placed at the tail of the list
        n ← node(value)
                if head = ø
                        head ← n
                        tail ← n
                else
                        tail.next ← n
                        tail ← n
                end if
        end Add
        Prepend(value)
        Pre: value is the value to add to the list
        Post: value has been placed at the head of the list
                n ← node(value)
                n.next ← head
                head ← n
                if tail = ø
                        tail ← n
                end
        end Prepend
         */

        public static void main( String[] args ){

                int[] value = {};
                int[] n = value;
                int[] head = {};

                if(  head == value  ){
                        head = n;
                        int[] tail = n;
                }else{
                }

        }

        


}
