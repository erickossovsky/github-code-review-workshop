# Facilitator guide (do not share with students)

## Timing (20 min)

| Min | What |
|-----|------|
| 0-2 | Teams of 2-4. Hand out team numbers. Everyone opens the repo README. |
| 2-7 | Authors open the PR. Reviewers read the ticket. |
| 7-17 | Reviewers run it and comment. Walk the room. |
| 17-20 | Authors reply. Two teams read their best comment aloud. |

## Setup checklist (before class)

1. Create the repo `github-workshop` (public), push `main` and all `team-*` branches.
2. Add every student as a collaborator with **Write** access (they need it to open PRs in the same repo
   and to commit fixes). Or have each team fork the repo.
3. Settings, Actions: allow workflows for pull requests.
4. Test once: open a PR from `team-1` into `main` and check that the **Run it** check prints output.

## Answer key

| Team | File | What is planted | Best verdict | Model comment |
|------|------|-----------------|--------------|---------------|
| 1 | `average.py` | Divides by `len + 1`. Returns 3.0, expected 4.0. | Request changes | `blocking:` average([2, 4, 6]) returns 3.0, expected 4.0. Divide by len(numbers). |
| 2 | `is_even.py` | Logic is inverted (`% 2 == 1`). | Request changes | `blocking:` is_even(4) returns False. The check is backwards. Use `% 2 == 0`. |
| 3 | `letter_grade.py` | Boundary bug: `> 90` should be `>= 90`. Only shows when you run with 90. | Request changes | `blocking:` letter_grade(90) returns B, expected A. Use `>= 90`. |
| 4 | `greeting.py` | Works. Only nits: unused import, commented-out debug line, misspelled variable `mesage`. | **Approve** with nits | `nit:` `os` is imported and never used. |
| 5 | `password.py` | Works, but prints the password to the console. | Request changes | `blocking:` the function prints the password. Remove the print. |
| 6 | `temperature.py` | Wrong formula (`* 9/5 - 32`). 0 gives -32.0, 100 gives 148.0. | Request changes | `blocking:` to_fahrenheit(0) returns -32.0, expected 32.0. The formula ends with `+ 32`. |
| 7 | `cart_total.py` | Works, but a payment API key is hard-coded in the file. | Request changes | `blocking:` a secret key is committed. Remove it and load it from an environment variable. |
| 8 | `vowels.py` | Only counts lowercase vowels. `Apple` gives 1, expected 2. | Request changes | `blocking:` count_vowels("Apple") returns 1, expected 2. Lowercase the text first. |

Team 4 is the "not everything is a blocker" team. Watch that they do not Request changes over nits.

## Coaching questions

- "Did you run it, or did you read it?"
- "Could the author fix this without asking you a question?"
- "Is this a nit or a blocker? What happens if it stays?"
- "Find the maybe in your comment and delete it."

## Wrap-up (last 2 min)

Ask two reviewers to read their best comment out loud. Ask the class: was it declarative? did it have a label?
