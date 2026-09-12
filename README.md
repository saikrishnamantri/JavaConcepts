## Bitwise operators

These work on the bits of integers.

## How to rebuild binary (do not memorize every number)

Each bit is a power of 2, from right to left:

```text
8  4  2  1
```

`1` means use that value. `0` means skip it.

### 5 to binary

`4 + 1 = 5`

```text
8  4  2  1
0  1  0  1     -> 0101
```

### 3 to binary

`2 + 1 = 3`

```text
8  4  2  1
0  0  1  1     -> 0011
```

### Divide-by-2 method

For `5`:

```text
5 / 2 = 2 remainder 1
2 / 2 = 1 remainder 0
1 / 2 = 0 remainder 1
```

Read remainders bottom to top: `101` → pad to `0101`.

For `3`:

```text
3 / 2 = 1 remainder 1
1 / 2 = 0 remainder 1
```

Read bottom to top: `11` → pad to `0011`.

### Small table

| Decimal | 8 | 4 | 2 | 1 | Binary |
|---------|---|---|---|---|--------|
| 0 | 0 | 0 | 0 | 0 | 0000 |
| 1 | 0 | 0 | 0 | 1 | 0001 |
| 2 | 0 | 0 | 1 | 0 | 0010 |
| 3 | 0 | 0 | 1 | 1 | 0011 |
| 4 | 0 | 1 | 0 | 0 | 0100 |
| 5 | 0 | 1 | 0 | 1 | 0101 |
| 6 | 0 | 1 | 1 | 0 | 0110 |
| 7 | 0 | 1 | 1 | 1 | 0111 |
| 8 | 1 | 0 | 0 | 0 | 1000 |

---

## Why `5 & 3 = 1`

`&` keeps a `1` only where **both** numbers have `1`.

```text
5 = 0101
3 = 0011
```

Column by column:

```text
bit of 5:   0   1   0   1
bit of 3:   0   0   1   1
            ---------------
AND (&):    0   0   0   1
```

| Place | Bit in 5 | Bit in 3 | Both 1? | Result |
|-------|----------|----------|---------|--------|
| 8 | 0 | 0 | no | 0 |
| 4 | 1 | 0 | no | 0 |
| 2 | 0 | 1 | no | 0 |
| 1 | 1 | 1 | yes | 1 |

`0001` is decimal `1`.

Same idea for the others:

- `|` puts `1` if **either** bit is 1 → `0111` = 7
- `^` puts `1` if the bits are **different** → `0110` = 6

---

## Why `~5 = -6`

`~` flips every bit.

Java `int` is a **32-bit signed** number (two's complement).  
The useful formula is:

```text
~x = -x - 1
```

So:

```text
~5 = -5 - 1 = -6
```

Shown with 8 bits for readability:

```text
 5 = 00000101
~5 = 11111010
```