# AI Agent Guide for SingletonPatternExample

## Project overview
- Tiny Java sample demonstrating the Singleton pattern.
- Contains `Logger.java` and `SingletonTest.java`.
- No build system is present; the project is intended to work with plain `javac` and `java`.

## Recommended agent behavior
- Treat this repository as a small single-package Java example.
- Prefer simple, idiomatic Java fixes over introducing libraries, frameworks, or additional build tooling.
- Correct obvious naming and style issues in existing classes.
- Preserve the minimal scope of the sample.

## Build and run
- Compile: `javac Logger.java SingletonTest.java`
- Run: `java SingletonTest`

## Key points
- `Logger.java` implements a singleton and should follow Java naming conventions (`getInstance`, `log`, etc.).
- `SingletonTest.java` is currently incomplete and should be completed so it compiles and demonstrates the singleton.
- Keep changes local to the two existing files unless the user explicitly asks for a larger refactor.

## Preferences
- Use standard Java naming conventions: PascalCase for classes, camelCase for methods.
- Keep the implementation simple and easy to understand.
- Do not introduce a package declaration unless the user requests a package-based refactor.

## When modifying code
- Ensure the repository remains runnable from the workspace root.
- Favor a plain `main` method demonstration over adding a testing framework.
- If adding comments, keep them short and explanatory.
