**Set nth bit**
```
 x | ( 1<<n )
```
**Unset nth bit**
```
 x & ~( 1<<n )
```
**Toggle nth bit**
```
x ^ (1<<n)
```
**Round off to the next power of two**
```
unsigned int v; //only works if v is 32 bit
v--;
v |= v >> 1;
v |= v >> 2;
v |= v >> 4;
v |= v >> 8;
v |= v >> 16;
v++;
```
**Round down / floor a number**
```
 n >> 0
 
 5.7812 >> 0 // 5
```

**Get the Maximum Integer**
```
int maxInt = ~(1 << 31);
int maxInt = (1 << 31) - 1;
int maxInt = (1 << -1) - 1;
int maxInt = -1u >> 1;
```
**Set nth bit**
```
 x | ( 1<<n )
```
**Set nth bit**
```
 x | ( 1<<n )
```
