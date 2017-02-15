CC = g++
CFLAGS = -g
OBJS = main.o

pdtocsv: $(OBJS)
	$(CC) $(CFLAGS) -o pdtocsv $(OBJS)
%: %.cpp
	$(CC) $(CFLAGS) -o $<
clean:
	rm -rf *.o pdtocsv *~
