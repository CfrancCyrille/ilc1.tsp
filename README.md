# TP 4A 2020-21: The traveling salesman problem (TSP) with genetic algorithm

## Questions
1. Fork this github repository  (2 points)
2. Run the project
3. Comment the 3 classes: City, Population & Tour (3 points)
4. Commit your changes and check-it into github
5. On github, make a pull request (1 point)
6. Complete the next section: "Analyze IADT functions" into this file (2 points)
7. Commit your changes (commit README.md)
8. On github, update your pull request (1 point)
9. Make tests defined into section: "Functions to test now" (call your test functions using the rule: GIVEN_WHEN_THEN) (10 points)
10. Check the test coverage with the Jacoco coverage report provided into: /target/site/jacoco/index.html
11. Commit your changes
12. On github, update your pull request (1 point)
13. that ends

## Analyze IADT functions
Hereafter, for each classes give function to be tested. Remember that all functions does not have to be tested, some code can be checked by a simple inspection or an analyse, another code can be validated by definition (rules, etc) the others function can be tecsted by unit tests, integration tests or validation tests (IADT: Inspect, Analyse, Define, Test). 

| Validation Mode |   Why ? When ?  |
| :-------------: | :-------------: |
| I: Inspect | No test needed, just a simple static test (visual) on a subset of classes (commentaries, indentation, etc.) |
| A: Analyze | Not easy to test but the algorithm is well know and can be check by a static analyze |
| D: Def/Dem | You can Demonstrate the function or by Definition the function needs not test (generate code, call functions, etc.)|
| T: Test | the function can be easily test |

### Class City

| Function      |     I A D T     |        Comment |
| :------------ | :-------------: | :------------- |
| distanceToCity | T | need to test, fundamental for the algorithm  | 
| getX | D | no need to test a getter | 
| getY | D | no need to test a getter | 
| toString | I | no need to test, function well known  | 

### Class Tour

| Function      |     I A D T     |        Comment |
| :------------ | :-------------: | :------------- |
| containsCity  | D | no need to test |
| getCity  | D | no need to test a getter |
| getDistance  | T | too much conditions, fundamental to test  |
| getFitness  | I | simple static test (visual) |
| setCity  | D | no need to test a setter |
| tourSize  | D | no need to test a getter |
| toString  | I | no need to test, function well known  |

### Class Population

| Function      |     I A D T     |        Comment |
| :------------ | :-------------: | :------------- |
| getFittest  | T | fundamental to test for the algorithm |
| getTour  | D | no need to test a getter |
| populationSize  | D | no need to test a getter |
| saveTour  | D | no need to test a setter |

## Functions to test now

### Class City

```Java
public double distanceTo(City city)
```

### Class Tour

```Java
public int getDistance()
```

### Class GA

```Java
public static Population evolvePopulation(Population pop)
```

## Tricks & tips

- Start with simple classes (models, libraries, etc) at the end make test into complex classes (classes with multiple relations)
- Never test auto generate code
- Never test creator (its a design problem)
- Use @Test before each testFunction !
- You can test a function than throws an exception with the argument: expected
```Java
@Test(expected=Exception.class)
```

## Documentation
http://www.theprojectspot.com/tutorial-post/applying-a-genetic-algorithm-to-the-travelling-salesman-problem/5