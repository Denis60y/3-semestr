import pandas as pd
import PyPDF2


title = ['Название', 'Авторы', 'регистрационный номер', 'номер заявки', 'правообладатель', 'дата поступления', 'дата регистрации', 'полный путь до файла']

authors = []


with open('resources/input/Текстовый формат/Виртуальная установка «Поршневой компрессор».PDF', 'rb') as pdf_file_obj:
    pdf_file_reader = PyPDF2.PdfReader(pdf_file_obj)
    
    first_page = pdf_file_reader.pages[0]
    first_page_text = first_page.extract_text()
    
    lines = first_page_text.split('\n')

    print(first_page_text)

    for i, line in enumerate(lines):
        if "(RU)" in line:
            authors.append(line)
        if "Виртуальная установка «Поршневой компрессор»" in line:
            name = line
        if "Номеррегистрации" in line:
            number = lines[i + 1]




authors.pop()
authors[0] = authors[0][0: 6] + " " + authors[0][6: 11] + " " + authors[0][11: 21]
authors[1] = authors[1][:-34]
authors[2] = authors[2][0:7] + " " + authors[2][7:-35]
authors[3] = authors[3][:-28]
authors[4] = authors[4][:-37]
authors[5] = authors[5][:-6]
authors[6] = authors[6][:-5]





























data = []
data.append(name)
data.append(authors)
data.append(number)


test = {}

for i in range(len(title)):
    if i > 2:
        test[f"{title[i]}"] = "popa"
    else:
        test[f"{title[i]}"] = data[i]


df = pd.DataFrame(test)


df.to_excel('resources/test.xlsx')