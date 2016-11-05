#include <unistd.h>  
#include <stdio.h>
#include <sys/wait.h>
#include <pthread.h>
void thread(void) {
		int i;
		while(1){
	//	for(i = 0; i < 3; i++) {
				printf("this is a thread \n");
				sleep(1);
		}
}

int main() {
		pid_t fpid;
		pthread_t id;
		int count = 0;
		int flag = 0;
		while(1) {
				printf("this is a main \n");
				sleep(2);
		if(flag == 0) {
				flag = 1;
		fpid = fork();
		if(fpid < 0) {
				printf("bad\n");
		} else if(fpid == 0) {
				printf("child is %d\n", getpid());
				count++;
				while(1){
						sleep(1);
				}
		} else {
				int ret = pthread_create(&id, NULL, (void *)thread, NULL);
				printf("ret is %d\n", ret);
	//			pthread_join(id, NULL);
				waitpid(fpid, NULL, 0);
				printf("father is %d\n", getpid());
				count++;
		}
		printf("result is %d\n", count);
		}
		}
		return 0;
}
