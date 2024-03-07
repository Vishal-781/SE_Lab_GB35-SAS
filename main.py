from inventorySystem import InventorySystem

def main():
    print("Welcome to the Supermarket Automation System!")
    is_manager = input("Are you a manager? (yes/no): ").lower() == "yes"
    item_system = InventorySystem(is_manager)

    while True:
        print("\nMenu:")
        print("1. Add items")
        print("2. Restock an item")
        print("3. Sell an item")
        print("4. Discard an item")
        print("5. View item statistics")
        print("6. Exit")

        choice = input("Enter your choice: ")

        if choice == "1":
            num_items = int(input("Enter the number of items to add: "))
            item_system.addItems(num_items)
        elif choice == "2":
            item_system.restockItem()
        elif choice == "3":
            item_system.removeItem("sell")
        elif choice == "4":
            item_system.removeItem("discard")
        elif choice == "5":
            stats = item_system.statview()
            print(stats)
        elif choice == "6":
            print("Exiting the program...")
            break
        else:
            print("Invalid choice. Please try again.")

if __name__ == "__main__":
    main()
