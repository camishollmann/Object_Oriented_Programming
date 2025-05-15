import random

def populate_list(size):
    int_list = []

    # Uses the randint method to populate the list:
    for number in range(size):
        int_list.append(random.randint(1, 150))
    
    return int_list

def number_type(int_list):
    for number in int_list:
        if number % 3 == 0:
            print(f"{number} - is a multiple of three.")
        elif number % 2 == 0:
            print(f"{number} - even number.")
        else:
            print(f"{number} - odd number.")


def main():
    try:
        size = int(input("Enter the size of the list: "))

        my_list = populate_list(size)

        number_type(my_list)

    except ValueError:
        print("Invalid input. Please enter a valid integer.")

if __name__ == "__main__":
    main()
