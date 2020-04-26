/*
Algoritmo que calcula a media e desvio padrão de cada coluna de uma matriz.
*/

#include <iostream>
#include <math.h>

using std::cout;
using std::endl;
using std::cin;

//Variáveis globais
const int l = 5;
const int c = 5;
double vet[l][c];

void print(double media[], double dp[]){

    for(int i=0; i<l; i++){
        for(int j=0; j<c; j++){
            cout << vet[i][j] << " ";
       }
       cout << endl;
    }

   cout << endl;

    cout << "Média das Colunas:   Desvio Padrao:" << endl;
    for(int j=0; j<c; j++){
        cout << "[" << j << "] -> " << media[j] << "            " << dp[j] << endl;
    }

}

void desv_padrao(double media[]){

   double matriz[l][c];
   double dp[c];

   //Soma dos quadrados
   for(int j=0; j<c; j++){
   dp[j] = 0;
      for(int i=0; i<l; i++){
         matriz[i][j] = vet[i][j] - media[j];
         matriz[i][j] = pow(matriz[i][j],2);
         dp[j] += matriz[i][j];
      }
   dp[j]/=l;
   dp[j] = sqrt(dp[j]);
   }

    print(media, dp);
}

void calc_media(){

    double media[c];

    for(int j=0; j<c; j++){
    media[j] = 0;
        for(int i=0; i<l; i++){
            media[j]+= vet[i][j];
        }
        media[j]/=l;
    }

    desv_padrao(media);
}

int main(){

    cout << "Linhas: Colunas:" << endl;

    for(int i=0; i<l; i++){
        for(int j=0; j<c; j++){
            cout << "   [" << i << "]   [" << j << "]" << endl;
            cin >> vet[i][j];
        }
        cout << endl;
    }

    calc_media();

    return 0;
}
