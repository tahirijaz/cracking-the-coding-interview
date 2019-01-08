#	3.2	Implemenet stack in addition to push, pop also returns the min in O(1) time.

import json

class StackMin():
	def __init__(self):
		self.stack = list()	
		

	def push(self, val):
		node = {'val': val}
		
		if self.stack:
			top = self.peek()
			if val < top['min']:
				node['min'] = val
			else:
				node['min'] = top['min']
		else:
			node['min'] = val				
		
		self.stack.insert(0, node)

	def pop(self):
		return self.stack.pop(0)
		
	def peek(self):
		return self.stack[0]

	def printstack(self):
		print(json.dumps(self.stack, indent=4))
		
	
stack = StackMin()
stack.push(10)
stack.push(11)
stack.push(12)
stack.push(8)
stack.push(4)
stack.push(12)
stack.printstack()
