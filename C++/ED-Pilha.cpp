#include <iostream>
#include <stdlib.h>
#include <locale>

using std::cout;
using std::cin;
using std::endl;

typedef struct no{
    int value;
    struct no *prev;
}no;

int menu();

void inserir(no **, no *);
void mostrar(no **, no *);
void remover(no **);

int main(){

    setlocale(LC_ALL, "Portuguese");
    no *pilha = NULL;
    int flag = 0;

    do{
        switch(menu()){
        case 1:
        //Inserir
        inserir(&pilha, pilha);

        break;
        case 2:
        //Remover
            remover(&pilha);

        break;
        case 3:
        //Apagar Pilha
        pilha = NULL;

        break;
        case 4:
        //Mostrar Pilha
            mostrar(&pilha, pilha);
            cout << endl;
            system("pause");
        break;
        case 5:
        //Sair
            flag = 1;
        break;
        default:
            cout << "Opção Inválida!" << endl;
            system("pause");
        }
        system("cls");
    }while(flag != 1);

    return 0;
}

void mostrar(no **pilha, no *aux){

    if(*pilha == NULL){
        cout << "Pilha vazia!" << endl;
    }else{
        do{
            cout << aux->value << " | ";
            aux = aux->prev; //O ptr 'aux' agora vai apontar para o proximo valor
        }while(aux != NULL);
    }
}

void remover(no **pilha){

    *pilha = (*pilha)->prev;

}

void inserir(no **pilha, no *aux){

    int num;

    cout << "Digite o inteiro a ser inserido: ";
    cin >> num;

    aux = (no *)malloc(sizeof(no));

    aux->value = num;
    aux->prev = *pilha;
    *pilha = aux;
}

int menu(){
    int op;

    cout << "***PILHA***" << endl;
    cout << "[1] - Inserir" << endl;
    cout << "[2] - Remover" << endl;
    cout << "[3] - Apagar Pilha" << endl;
    cout << "[4] - Mostrar Pilha" << endl;
    cout << "[5] - Sair" << endl;
    cin >> op;

    return op;
}
