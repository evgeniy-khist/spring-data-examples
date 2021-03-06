/*
 * Copyright 2020 Evgeniy Khyst
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.spring.data.jpa;

import com.example.spring.data.jpa.entity.BookWithBatchSize;
import com.example.spring.data.jpa.repository.AbstractBookRepository;
import com.example.spring.data.jpa.repository.BookWithBatchSizeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
class BookWithBatchSizeRepositoryTest extends AbstractBookRepositoryBaseTest<BookWithBatchSize> {

  @Autowired
  private BookWithBatchSizeRepository bookRepository;

  @Override
  BookWithBatchSize createBook() {
    return new BookWithBatchSize();
  }

  @Override
  AbstractBookRepository<BookWithBatchSize> getBookRepository() {
    return bookRepository;
  }
}
