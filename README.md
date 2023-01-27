# Secure-transmission-of-text-and-image-files-

The idea for this project is to implement an algorithm which will help us encrypt the data that is basically code in such a format that is not readable or understandable by normal humans. The data is encoded in some format using the algorithms which are proposed so that the data which we are trying to pass is secure from attacks made or any form of snooping done. Encrypting of data and converting it into cipher text or coded text with a given algorithm prevents it from being directly readable by the hacker and this thing ensures that the data is not being snooped on or used for any sort of advantageous purposes. The aim for this project is to encrypt the text data which is present into cipher text and then again try to decrypt it to get the original text. Decrypting the data is again a very important part since if we use an algorithm to encrypt and decrypt the data and decryption gives a different output from what we have given as input text then it may cause a lot of ambiguity and will make the job difficult. Hence it is necessary that after encrypting the data we should be able to retrieve back the original data. Here, DES algorithm is used to encrypt and decrypt.

## Software Requirements:

NetBeans IDE 8.2

o	Java version 8
    
o	Java Development Kit (JDK)
    
o	Java Runtime Environment (JRE)
    
o	Java Virtual Machine (JVM)
  
o	Java Compiler
    
o	Libraries:
    
-> Java package java.io
        
-> Java package java.security

-> Java package javax.crypto

## High-Level Design:

### Block Cipher:

![image](https://user-images.githubusercontent.com/67183417/215139932-b85d2b18-59a6-4dd3-9ee5-df5894fbbf6a.png)

### Encryption algorithm:

![image](https://user-images.githubusercontent.com/67183417/215139998-e61ab463-6c75-40cc-b32d-ae9bdd28d0df.png)

## Low-Level Design:

### Encryption and Decryption:

![image](https://user-images.githubusercontent.com/67183417/215140262-827e0edf-8c09-4073-b48f-df46d56dc399.png)

### Block:

### ![image](https://user-images.githubusercontent.com/67183417/215140312-fb9e15f4-0402-4688-bb0c-65b22a03a2ac.png)

## Explanation:

•	We use a block cipher, which encrypts the data in a block of 64 bits each, which means 64 bits of plain text go as the input to DES and produces 64 bits of ciphertext.

•	The length of the key is 56 bits. The initial key consists of 64 bits. But, before the encryption starts, every 8th bit is discarded to produce 56 bits key.

•	With 64-bit plain text and 56 bits key, we get 64 bits of Cipher Text.

## Steps in algorithm:

•	In the first step, the 64-bit plain text block is handed over to an initial Permutation (IP) function.

•	The initial permutation is performed on plain text.

•	Next, the initial permutation (IP) produces two halves of the permuted block; saying Left Plain Text (LPT) and Right Plain Text (RPT).

•	Now each LPT and RPT go through 16 rounds of the encryption process.

•	In the end, LPT and RPT are re-joined and a Final Permutation (FP) is performed on the combined block

•	The result of this process produces 64-bit ciphertext.

## Fundamental attributes used:

•	Substitution (also called as Confusion)

•	Transposition (also called as Diffusion)

In this algorithm, we use substitution and transposition repeatedly for 16 times.

## Diffusion/Transposition:

•	Can be achieved by repeatedly performing some permutation on the data followed by applying a function to that permutation;

•	The effect is that bits from different positions in the original plaintext contribute to a single bit of ciphertext

## Confusion/Substitution:

•	Seeks to make the relationship between the statistics of the ciphertext and the value of the encryption key as complex as possible

•	To thwart attempts to discover the key.

•	Even if the attacker can get some handle on the statistics of the ciphertext,

•	The way in which the key was used to produce that cyphertexts so complex as to make it difficult to deduce the key.

## Initial Permutation:

•	The initial permutation (IP) happens only once and it happens before the first round. It suggests how the transposition in IP should proceed. For example, it says that the IP replaces the first bit of the original plain text block with the 58th bit of the original plain text, the second bit with the 50th bit of the original plain text block, and so on.

•	This is nothing but jugglery of bit positions of the original plain text block. the same rule applies to all the other bit positions.

•	As we have noted after IP is done, the resulting 64-bit permuted text block is divided into two half blocks. Each half-block consists of 32 bits, and each of the 16 rounds.

## Key transformation:

•	Initial 64-bit key is transformed into a 56-bit key by discarding every 8th bit of the initial key. Thus, for each a 56-bit key is available. 

•	From this 56-bit key, a different 48-bit Sub Key is generated during each round using a process called key transformation. 

•	For this, the 56-bit key is divided into two halves, each of 28 bits. These halves are circularly shifted left by one or two positions, depending on the round.

•	After an appropriate shift, 48 of the 56 bits are selected for selecting 48 of the 56 bits. 

•	For instance, after the shift, bit number 14 moves to the first position, bit number 17 moves to the second position, and so on. 

•	The table contains only 48-bit positions. Bit number 18 is discarded like 7 others, to reduce a 56-bit key to a 48-bit key. Since the key transformation process 
involves permutation as well as a selection of a 48-bit subset of the original 56-bit key it is called Compression Permutation.

•	Because of this compression permutation technique, a different subset of key bits is used in each round. That makes DES not easy to crack.

## Expansion Permutation:

•	After the initial permutation, we had two 32-bit plain text areas called Left Plain Text (LPT) and Right Plain Text (RPT). 

•	During the expansion permutation, the RPT is expanded from 32 bits to 48 bits. Bits are permuted as well hence called expansion permutation. 

•	This happens as the 32-bit RPT is divided into 8 blocks, with each block consisting of 4 bits. Then, each 4-bit block of the previous step is then expanded to a corresponding 6-bit block, i.e., per 4-bit block, 2 more bits are added.

•	Expansion Permutation process results in expansion as well as a permutation of the input bit while creating output. 

•	The key transformation process compresses the 56-bit key to 48 bits. Then the expansion permutation process expands the 32-bit RPT to 48-bits. 

•	Now the 48-bit key is XOR with 48-bit RPT and the resulting output is given to the next step, which is the S-Box substitution.

## Encryption Algorithm:

•	The technique which we are using here is a block cipher.

•	Here, any cryptographic key and its related algorithm are applied to a data.

•	This block of data is generally of 64 bits in size.

•	It computes or processes a complete block of 64 bits of data rather than processing things bit -by-bit.

•	Each block of 64-bit data is enciphered or encrypted using the secret key.

•	Each block when it is enciphered or encrypted using secret key, we get a 64-bit ciphertext.

•	This 64-bit ciphertext is generated by using different means of permutation and substitution methods.

•	This process of permutation and substitution involves 16 rounds which could run under four different modes.

•	This block which is now encrypted is encrypted individually.

## Decryption algorithm:

•	This block which was encrypted individually is taken.

•	After this the block enciphered is passed through 16 rounds in four different modes.

•	Now with the help of substitution and permutation methods we get the 64-bit ciphertext.

•	Now the enciphered block is deciphered using the same secret key.

•	And finally, we can retrieve out data.
