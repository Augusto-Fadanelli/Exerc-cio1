//Notas Alunos

#include <iostream>
#include <locale> // para o setlocale
#include <stdlib.h> // para o system("cls"); (So funciona no windows)

using std::cout;
using std::cin;
using std::endl;
using std::string;

typedef struct Pessoa{
    int idade;
    float notas;
    float media;
    string nome;
}Pessoa;

int quantidade();

int main()
{
    setlocale(LC_ALL, "Portuguese");
    //char nom[100];

    int qt = quantidade();
    float medturma = 0;

    Pessoa p[qt][2];

    for(int i=0; i<qt; i++){
            cout << "Digite o nome do " << i+1 << " aluno: ";
            cin >> p[i][0].nome;
            cout << endl;
            cout << "Digite a idade do aluno: ";
            cin >> p[i][0].idade;
            cout << endl;
        for(int j=0; j<2; j++){
            cout << "Digite a nota N" << j+1 << " do aluno: ";
            cin >> p[i][j].notas;
            cout << endl;
        }
        system("cls");

        p[i][0].media = (p[i][0].notas + p[i][1].notas)/2;
        medturma += p[i][0].media;
    }

    medturma /= qt;

    for(int i=0; i<qt; i++){
        cout << "Nome: " << p[i][0].nome << endl;
        cout << "Idade: " << p[i][0].idade << endl;
        cout << "A media do Aluno e: " << p[i][0].media << endl;
    }

    cout << "A media da turma é: " << medturma << endl;

    return 0;
}

int quantidade(){

    int qt;

    cout << "Digite a quantidade de pessoas: " << endl;
    cin >> qt;

    system("cls");

    return qt;
}
