# Dum Period 1
### Kevin Bao, Jackie Woo, Datian Zhang

## Design -

We used an ArrayPriorityQueue to store tickets so that higher-priority tickets can be dequeued before lower-priority tickets.

We used an ArrayList to store services in order or priority, so that a high-priority service will have a low index, and a low-priority service will have a high index. 

1) Upon running the program, we prompt the user (using a for loop) for whether or not they need help. This way he/she can make multiple ticket requests.  

2) If the user needs help, then the user is told to input his/her name. Otherwise, the program exits the for loop, resolves, and stops. 

3) The user then inputs his/her selection of a service. We then use this input to assign priority. If the user selects an invalid service, then the lowest-priority service will be automatically selected.

4) All of the previously user-inputted information is then used to create and add a ticket that includes the user's name and service to a ticket list.

5) The user who owns the ticket with the highest priority is granted his/her service.

6) Step 1 is repeated.


## Extras
1) The ticket's toString() allows the ticket to be displayed by the terminal as an actual ticket with the user's name, description, ticket number, and priority.

2) We make the user choose from a list of services which kind of problem they have, making prioritizing easier.

3) Added non-user created tickets to the ArrayPriorityQueue of tickets to simulate an actual help desk center.

4) We used the cs1 package's Keyboard class to read user inputs.
