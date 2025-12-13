import pandas as pd
import PyPDF2


title = ['Название', 'Авторы', 'регистрационный номер', 'номер заявки', 'правообладатель', 'дата поступления', 'дата регистрации', 'полный путь до файла']

author = []

path1 = 'resources/input/Текстовый формат/Виртуальная установка «Поршневой компрессор».PDF'

with open(path1, 'rb') as pdf_file_obj:
    pdf_file_reader = PyPDF2.PdfReader(pdf_file_obj)
    
    first_page = pdf_file_reader.pages[0]
    first_page_text = first_page.extract_text()
    
    lines = first_page_text.split('\n')

    print(first_page_text)

    for i, line in enumerate(lines):
        if "(RU)" in line:
            author.append(line)
        if "Название программы дляЭВМ:" in line:
            name = lines[i + 1]
        if "Номеррегистрации" in line:
            number = lines[i + 1]

    author.pop()
    author[0] = author[0][0: 6] + " " + author[0][6: 11] + " " + author[0][11: 21]
    author[1] = author[1][:-34]
    author[2] = author[2][0:7] + " " + author[2][7:-35]
    author[3] = author[3][:-36] + " " + author[3][14:-28]
    author[4] = author[4][:-47] + " " + author[4][14:-37]
    author[5] = author[5][:-6]
    author[6] = author[6][:-5]

    authors1 = ""

    for i in range(len(author)):
        authors1 += author[i] + ", "

    data1 = []
    data1.append(name)
    data1.append(authors1)
    data1.append(number)

    print(author)





test = {}

for i in range(len(title)):
    if i > 2:
        test[f"{title[i]}"] = "popa"
    else:
        test[f"{title[i]}"] = data1[i]


df = pd.DataFrame([test])

df.to_excel('resources/test.xlsx')