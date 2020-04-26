#include <iostream>
//#include <locale> //Para setlocale
#include <stdlib.h> //para system("cls"); e para malloc();

//Verifica se o SO é GNU/Linux ou Windows
#ifdef _unix_

	#define OS_UNIX

#elif defined(_WIN32) || defined(WIN32)

	#define OS_WINDOWS

#endif

using std::cin;
using std::cout;
using std::endl;

typedef struct tree{
    int id;
    struct tree *left;
    struct tree *right;
}tree;

tree * _add(tree *, int);
tree *createNo(int);

int menu();
int mallocVerify(tree *, tree *); //Verifica se malloc conseguiu encontrar um espaço de memória livre para no* novo

void clear();
void pause();

int main(){
    setlocale(LC_ALL, "Portuguese");

    tree *root = NULL;
    int flag = 0;
    int id;

    do{
        switch(menu()){
        case 1:
        //inserir - _add();
        cout << "Insira a nova chave: ";
        cin >> id;
        root = _add(root, id);

        break;
        case 2:
            flag = 1;
        break;
        default:
            cout << "Opção Inválida!" << endl;
            pause();
        }
        clear();
    }while(flag != 1);

    return 0;
}

int menu(){
    int op;

    cout << "*****ÁRVORES*****" << endl;
    cout << "[1] - Inserir" << endl;
    cout << "[2] - Sair" << endl;
    cin >> op;

    return op;
};

tree *_add(tree *newid, int id){
    if(newid == NULL){
        return createNo(id);
    }else{
        if(id < newid->id){
            newid->left = _add(newid->left, id);
        }else{
            if(id > newid->id){
                newid->right = _add(newid->right, id);
            }else{
                cout << "Este id já foi inserido anteriormente na árvore!" << endl;
                pause();
                return NULL;
            }
        }
    }
    return newid;
};

tree *createNo(int id){
    tree *newid = (tree *)malloc(sizeof(tree)); //O ponteiro 'novo' recebe o local indicado por malloc(); do tamanho definido por sizeof();
    newid->right = NULL;
    newid->left = NULL;
    newid->id = id;

    return newid;
};

int mallocVerify(tree *novo, tree *lista){

	int flag = 0;

	 if (novo == NULL){ //Impede que o programa execute caso o malloc não consiga encontrar memória livre
        cout << "Memória insuficiente!\n Tente fechar alguns programas ou reiniciar a máquina." << endl;
        flag = 1;
        pause();
        if(lista == NULL){ // se novo e lista == NULL então nada foi adicionado na lista e o programa pode ser fechado
            exit(1);
        } // se a lista possuir elementos o programa não fecha, mesmo com o malloc não conseguindo encontrar espaços de memória livres
    }

	return flag;
}

void clear(){

	#ifdef OS_WINDOWS
	// Codigo Windows
		system("cls");
	#else
    //Codigo GNU/Linux
		system("clear");
	#endif
}

void pause(){

    #ifdef OS_WINDOWS
    // Codigo Windows
        system("pause");
    #else
    // Codigo GNU/Linux
        cout << "Pressione qualquer tecla para continuar...";
        getchar();
    #endif

}
