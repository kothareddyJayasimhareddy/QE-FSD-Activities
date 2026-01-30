class car:

    def __init__(self, manufacturer,model,make,transmission, color):
        self.manufacturer = manufacturer
        self.make = make
        self.color = color
        self.model = model
        self.transmission = transmission

    def accelerate(self):
        print(f"{self.manufacturer} {self.model} is moving")
    
    def stop(self):
        print(f"{self.manufacturer} {self.model} is stopped")


car1 = car("benz","mercedes",2021,"manual","red")
car2 = car("toyata","innova",2023,"manual","blue")
car3 = car("maruthi","swift",2023,"manual","black")


print(car1.accelerate())
print(car2.stop())


