import numpy as np
a = np.array([0, 30, 45, 60, 90])

print('Sine of different angles:')
# Convert to radians by multiplying with pi/180
print(np.sin(a*np.pi/180))
cos = np.cos(a*np.pi/180)
inv = np.arccos(cos)
print(inv)
print(np.degrees(inv))

a = np.array([-1.7, 1.5, -0.2, 0.6, 10])
