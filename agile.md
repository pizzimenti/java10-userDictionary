############################################### doing

#### model (business logic)

  lets users create a dictionary
  .  create Word class
  .  method to get word
    list to store multiple words
    method to display list
    create Definition class

#### view (vtl template files)

  homepage/rootpage of the app (get)
    user able to add a word
    on load lists all of the words
    user can click on them to view all of their definitions
    when viewing a word, able to add one or more definitions

  definitions page
    parses or loads in right-frame of rootpage
    lets a user add a definition (first one or additional)

#### controller (App.java)

  renders main page on (GET)
  renders definitions page on Click (POST) (<button value=$word>)
  allows adding of new words
  allows adding of new definitions


  Objectives
    All previous standards are in place from previous code reviews
    An instance of one class appears in the method of another class
    Spark routes process GET and POST requests/responses successfully
    Objects are created from a custom class with a custom constructor
    Object unit tests are organized into their own files separate from integration tests

  create readme


############################################### done

############################################### backlog
