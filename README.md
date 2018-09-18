# SomeSmallTasks_t001
  Make (in Java) an equivalent of a Python code example of VagueList, a list that can yield adjacent elements (insted of one requested)
and without ArrayOutOfBounds or other errors when getting elements with any index...
```Python
import random

class VagueList:
    def __init__(self, cont):
        self.cont = cont

    def __getitem__(self, index):
        return self.cont[(index + random.randint(-1, 1)) % len(self.cont)]

    def __len__(self):
        return random.randint(0, len(self.cont)*2)

vague_list = VagueList(["A", "B", "C", "D", "E"])
print(len(vague_list))
print(len(vague_list))
print(vague_list[4])
print(vague_list[4])
```
