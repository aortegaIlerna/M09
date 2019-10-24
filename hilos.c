#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

int main() {
    int status;
    int NUMBER_OF_PROCESSES = 20;
    int num = 0;

    printf("Bienvenidos a vuestro primer programa de Hilos en C.\n");
    for (int i = 0; i < NUMBER_OF_PROCESSES; i++) {
        int pid = fork();
        sleep(2);
        printf("PID == %d\n", pid);
        if (pid == 0) {
            printf("Soy el hijo\n");
            break;

        } else {
            printf("Soy el padre\n");
        }
    }

    printf("Adios\n");
    return 0;

}


