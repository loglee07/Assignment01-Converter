# Assignment 1: Converter and Pixel System

## Description

This project contains four programs that demonstrate how information can be represented using characters, number bases, and pixels.

## Programs

* `AsciiConverter.java` converts ASCII characters into decimal values.
* `BaseConverter.java` converts 8-bit values between binary, decimal, octal, and hexadecimal.
* `PixelConverter.java` reads `smiley.png` and writes its pixel color codes to `output.txt`.
* `PixelImageCreator.java` reads color codes from `awesome_picture.txt` and creates `created_image.png`.

## Requirements

* Java JDK 17 or later
* All required image and text files must be in the same folder as the programs.

## How to Run

Compile the programs:

`javac AsciiConverter.java`

`javac BaseConverter.java`

`javac PixelConverter.java`

`javac PixelImageCreator.java`

Run the ASCII converter:

`java AsciiConverter`

Run the number-base converter:

`java BaseConverter`

Run the image-to-pixel converter:

`java PixelConverter`

This program reads `smiley.png` and creates `output.txt`.

Run the pixel-to-image converter:

`java PixelImageCreator`

This program reads `awesome_picture.txt` and creates `created_image.png`.

## Testing

The ASCII converter was tested with normal ASCII characters. The number-base converter was tested with zero, the largest supported 8-bit unsigned value of 255, the negative two’s-complement value -5, and a normal binary input. Both pixel programs were tested using the provided image and pixel text files.

## Sources and Collaboration

Starter examples for the ASCII and pixel programs were provided by Professor Dominic Dabish. ChatGPT was used for explanations, code formatting, debugging, and adapting the pixel-creation program to Java.
