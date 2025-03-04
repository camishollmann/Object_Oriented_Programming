import random

def populate_list(size):
    int_list = []

    for number in range(size):
        int_list.append(random.randint(1, 150))
    
    return int_list


def main():
    size = int(input("Enter the size of the list: "))

    my_list = populate_list(size)
    print(my_list)

if __name__ == "__main__":
    main()
